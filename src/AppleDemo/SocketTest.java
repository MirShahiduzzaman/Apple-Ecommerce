package AppleDemo;

public class SocketTest {

	public static void main(String[] args)
	{
		SocketUtils su = new SocketUtils();
		
		if (su.socketConnect() == true)
		{
			String s = "Date>";
			su.sendMessage(s);
			
			String recvMsg= "";
			recvMsg = su.recvMessage();
			System.out.println(recvMsg);
			
			s = "Stock>AAPL";
			su.sendMessage(s);
			
			recvMsg = su.recvMessage();
            System.out.println(recvMsg);			
			
			s = "QUIT>";
			su.sendMessage(s);
			
			su.closeSocket();
		}
	}
}
