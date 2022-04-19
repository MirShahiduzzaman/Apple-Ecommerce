package AppleDemo;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ConnectException;
import java.net.Socket;
import java.net.UnknownHostException;

public class socketUtils 
{
	Socket 	clientSocket        =null;
    DataOutputStream outToServer=null;
    BufferedReader inFromServer =null;
    
	public static void main(String[] args) 
	{
		socketUtils client = new socketUtils();
		client.socketConnect();
		
		client.sendMessage("iphone 13: 3");
		client.sendMessage("QUIT");
//		sends this message to specified server using the ip specified in ipaddress variable in socketConnect function
//		client.sendMessage("Hello from Apple again! :D");
		
//		client.sendMessage("Stock>TSLA");
//		String str = client.recvMessage();
//		String str2 = str.replaceAll(",", "\n");
//		str2 = str2.replace("{", "{\n");
//		str2 = str2.replace("}", "\n}");
//		System.out.println(str2);
		
//		client.sendMessage("Date>");
//		System.out.println(str2);
//		
//		client.sendMessage("QUIT");
//		String date = client.recvMessage();
//		System.out.println(date);
		client.closeSocket();
	}
	
	public boolean socketConnect()
	{
		String ipAddress, portString;
		int portNumber;
		boolean rc=false;
		
		try 
		{
	    	File file = new File("config.txt");
	        if (file.exists())
	        {
	           BufferedReader br = new BufferedReader(new FileReader("config.txt"));
	            
               ipAddress  = br.readLine();
               portString = br.readLine();
               portNumber = Integer.parseInt(portString);
               br.close();
	        }
	        else
	        {        
	           ipAddress  = "10.101.19.2"; //"10.101.10.74";	//"localhost"; //127.0.0.1 and "localhost" aren't working
	           portNumber = 3333;
	        }
	          
           clientSocket  = new Socket(ipAddress, portNumber);
           
           outToServer   = new DataOutputStream(clientSocket.getOutputStream());
           inFromServer  = new BufferedReader(
   	                       new InputStreamReader(clientSocket.getInputStream()));
           
           rc= true;
		}
		catch (ConnectException ex)
		{
			ex.printStackTrace();
			return false;
		}					
		catch (UnknownHostException ex)
	    {
			ex.printStackTrace();
			return false;
	    }
		catch (IOException ex) 
	    {
			ex.printStackTrace();
			return false;
	    }
		
		return rc;
	}
	
	public boolean sendMessage(String msg)
	{
		boolean rc=false;
		
		try 
		{
			outToServer.writeBytes(msg + "\r\n");
			rc = true;
		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rc;
	}
	
	public String recvMessage()
	{
		String msg=null;
		
		try
		{
			msg = inFromServer.readLine();
		} 
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return msg;
	}
	
	public boolean closeSocket()
	{
		boolean rc=false;
		
		try
		{
			clientSocket.close();
			
            rc=true;
		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rc;
	}
}