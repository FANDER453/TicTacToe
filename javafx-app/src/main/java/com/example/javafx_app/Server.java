package com.example.javafx_app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server extends Thread{
	private ServerSocket serverSocket;
	public Server(int port) throws IOException {
		serverSocket = new ServerSocket(port);
	}
	
	@Override
	public void run() {
		Socket clientSocketX = new Socket();
		Socket clientSocketO = new Socket();
		
		
		while(true) {
			try {
				clientSocketX = serverSocket.accept();
				PrintWriter xOut = new PrintWriter(clientSocketX.getOutputStream(), true) ;
				BufferedReader xIn = new BufferedReader(new InputStreamReader(clientSocketX.getInputStream()));
				
				
				clientSocketO = serverSocket.accept();
				PrintWriter oOut = new PrintWriter(clientSocketO.getOutputStream(), true);
				BufferedReader oIn = new BufferedReader(new InputStreamReader(clientSocketO.getInputStream()));
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
}

	public static void main(String[] args) {

	}

}
