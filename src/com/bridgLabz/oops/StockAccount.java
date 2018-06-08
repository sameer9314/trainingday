package com.bridgLabz.oops;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgeLabz.Utility.Utility;
import com.bridgelabz.datastructure.MyLinkedList;
import com.bridgelabz.datastructure.QueueLinkedList;
import com.bridgelabz.datastructure.StackLinkedList;
/**
 * Purpose : To perform the buy and sell operations and to get the available stock and upadte the stock account.
 * @author : Sameer Saurabh
 * @version : 1.0
 * @since : 1/06/2018
 */
public class StockAccount {
	static File f;
	static String regfileName = "";

	StockAccount(String fileName) {
		f = new File("/home/administrator/eclipse-workspace/Funtional_Programs/UserDetailFolder/" + fileName);
		try {
			System.out.println(f.createNewFile());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	static QueueLinkedList queList = QueueLinkedList.queue();
	static StackLinkedList stackList = StackLinkedList.stack();

	public static void ifFileFound(String fileName) {
		f = new File("/home/administrator/eclipse-workspace/Funtional_Programs/UserDetailFolder/" + fileName);
		try {
			System.out.println(f.createNewFile());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	void display() {
		System.out.println("User name   is   : " + UserHandle.userAccountList[UserHandle.itemIndex].userName);
		System.out.println("User amount is   : " + UserHandle.userAccountList[UserHandle.itemIndex].amount);
	}

	static void sell(int amount, JSONObject symbol) throws ParseException {
		System.out.println(" Displaying Company details : ");
		System.out.println("Company Name : " + symbol.get("Share Name"));
		System.out.println("Share Price : " + symbol.get("Share Price"));
		System.out.println("Available shares : " + symbol.get("Number of shares"));
		System.out.println(" How many shares you want to sell ");
		int noOfShareSell = Utility.getInt();
		if (noOfShareSell > Integer.parseInt((UserHandle.userAccountList[UserHandle.itemIndex].eachComopanyShareList
				.get(UserHandle.choice - 1).toString()))) {
			System.out.println(" Entered number of shares are not avialble in your account ");
			StockAccount.stockFileUpdate(UserHandle.userObjectList);
		} else {
			int num = Integer.parseInt((UserHandle.userAccountList[UserHandle.itemIndex].eachComopanyShareList
					.removeAt(UserHandle.choice - 1).toString()));
			UserHandle.userAccountList[UserHandle.itemIndex].eachComopanyShareList.insert(num - noOfShareSell,
					UserHandle.choice - 1);
			UserHandle.userAccountList[UserHandle.itemIndex].amount = amount
					+ ((Integer.parseInt(symbol.get("Share Price").toString())) * noOfShareSell);
			String time = LocalDateTime.now() + "";
			String s = "Share Name : " + symbol.get("Share Name") + "\n" + "Number of share sell : " + noOfShareSell
					+ "\n" + "Time of purchases : " + time + "\n" + "Total number of shares remained: "
					+ (UserHandle.userAccountList[UserHandle.itemIndex].userTotalShare -= noOfShareSell) + "\n"
					+ "Updated Balance : " + (UserHandle.userAccountList[UserHandle.itemIndex].amount) + "\n" + "\n";
			stackList.push(symbol.get("Share Name") + " stock sold.");
			queList.enqueue(symbol.get("Share Name") + " stock sold at : " + time);
			save(s, f);
			stockShareSellUpdate(symbol, noOfShareSell);
			StockAccount.stockFileUpdate(UserHandle.userObjectList);
		}
	}

	static void buy(int amount, JSONObject symbol) throws ParseException {
		System.out.println(" Displaying Company details : ");
		System.out.println("Company Name : " + symbol.get("Share Name"));
		System.out.println("Share Price : " + symbol.get("Share Price"));
		System.out.println("Available shares : " + symbol.get("Number of shares"));
		System.out.println(" How many shares you want to buy ");
		int noOfSharePurchased = Utility.getInt();
		if (noOfSharePurchased > Integer.parseInt((symbol.get("Number of shares").toString()))) {
			System.out.println(" Entered number of shares are not avialble ");
			StockAccount.stockFileUpdate(UserHandle.userObjectList);
		} else {
			if (((Integer.parseInt(symbol.get("Share Price").toString()))
					* noOfSharePurchased) <= UserHandle.userAccountList[UserHandle.itemIndex].amount) {
				LocalDateTime.now();
				UserHandle.userAccountList[UserHandle.itemIndex].amount = amount
						- ((Integer.parseInt(symbol.get("Share Price").toString())) * noOfSharePurchased);
				String time = LocalDateTime.now() + "";
				int num = Integer.parseInt((UserHandle.userAccountList[UserHandle.itemIndex].eachComopanyShareList
						.removeAt(UserHandle.choice - 1).toString()));
				UserHandle.userAccountList[UserHandle.itemIndex].eachComopanyShareList.insert(num + noOfSharePurchased,
						UserHandle.choice - 1);
				String s = "Share Name : " + symbol.get("Share Name") + "\n" + "Number of share purchased : "
						+ noOfSharePurchased + "\n" + "Time of purchases : " + LocalDateTime.now() + "\n"
						+ "Total number of shares : "
						+ (UserHandle.userAccountList[UserHandle.itemIndex].userTotalShare += noOfSharePurchased) + "\n"
						+ "Remaining Balance : " + UserHandle.userAccountList[UserHandle.itemIndex].amount + "\n"
						+ "\n";
				stackList.push(symbol.get("Share Name") + " stock bought.");
				queList.enqueue(symbol.get("Share Name") + " stock bought at : " + time);
				save(s, f);

				stockShareUpdate(symbol, noOfSharePurchased);
				StockAccount.stockFileUpdate(UserHandle.userObjectList);
			} else {
				System.out.println("Not enough amount avialable to buy share");
				StockAccount.stockFileUpdate(UserHandle.userObjectList);
			}
		}
	}

	@SuppressWarnings("unchecked")
	static void stockShareUpdate(JSONObject symbol, int noOfSharePurchased) {
		JSONObject obc = new JSONObject();
		obc.put("Share Name", symbol.get("Share Name"));
		obc.put("Share Price", symbol.get("Share Price"));
		obc.put("Number of shares", (Integer.parseInt(symbol.get("Number of shares").toString()) - noOfSharePurchased));
		UserHandle.userObjectList.display();
		UserHandle.userObjectList.removeAt(UserHandle.choice - 1);
		UserHandle.userObjectList.insert(obc.toString(), UserHandle.choice - 1);
		System.out.println();
		UserHandle.userObjectList.display();
	}

	@SuppressWarnings("unchecked")
	static void stockShareSellUpdate(JSONObject symbol, int noOfShareSell) {
		JSONObject obc = new JSONObject();
		obc.put("Share Name", symbol.get("Share Name"));
		obc.put("Share Price", symbol.get("Share Price"));
		obc.put("Number of shares", (Integer.parseInt(symbol.get("Number of shares").toString()) + noOfShareSell));
		UserHandle.userObjectList.display();
		UserHandle.userObjectList.removeAt(UserHandle.choice - 1);
		UserHandle.userObjectList.insert(obc.toString(), UserHandle.choice - 1);
		System.out.println();
		UserHandle.userObjectList.display();
	}

	static void save(String s, File f) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(f.getAbsoluteFile(), true));
			bw.write(s);
			bw.flush();
			System.out.println();
			System.out.println("User File updated successfully");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// static void printReport() {}
	// static double valueOf() {
	// return 0.0;
	// }
	static void availableStocks() {
		System.out.println("   Displaying the Deatail list of Company ");
		System.out.println("   Company Name  " + "  Share Price  " + "Number of shares");
		for (int i = 0; i < UserHandle.jsonArray.size(); i++) {
			JSONObject ob = (JSONObject) UserHandle.jsonArray.get(i);
			System.out.print((i + 1) + ". " + ob.get("Share Name") + "              ");
			System.out.print((ob.get("Share Price") + "          "));
			System.out.println(ob.get("Number of shares"));

		}
	}
	static MyLinkedList objectCreation() {
		for (int i = 0; i < UserHandle.jsonArray.size(); i++) {
			JSONObject ob = (JSONObject) UserHandle.jsonArray.get(i);
			UserHandle.userObjectList.add(ob.toJSONString());
		}
		return UserHandle.userObjectList;
	}
	@SuppressWarnings("unchecked")
	public static void stockFileUpdate(MyLinkedList out) throws ParseException {
		JSONArray tempArray = new JSONArray();
		System.out.println("Updating json");
		while (!out.isEmpty()) {
			tempArray.add((JSONObject) new JSONParser().parse((String) out.pop(0)));
		}
		try {
			BufferedWriter bufferedwriter = new BufferedWriter(new FileWriter(new File(
					"/home/administrator/eclipse-workspace/Funtional_Programs/src/com/bridgLabz/oops/stockfile.json")));
			bufferedwriter.write(tempArray.toString());
			bufferedwriter.close();
			System.out.println("Stock File updated succesfully");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
