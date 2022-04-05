package com.bit.tcp.step1;
import java.io.*;
import java.net.*;
public class Server {

   public static void main(String[] args) {
      ServerSocket serve=null; 
      Socket sock=null;
//      InputStream is=null;
//      InputStreamReader isr=null;
//      BufferedReader br=null;//라인단위로 읽기위해 버퍼를 달아준다.
      OutputStream os=null;
      PrintStream ps=null;
      try {
         serve=new ServerSocket(5000);//포트번호를 열고 대기해야하마.
         System.out.println("접속 대기...");
         sock=serve.accept();
         System.out.println("누군가 들어옴...");
         
         InetAddress addr=sock.getInetAddress();
         System.out.println(addr.getHostAddress());
         os=sock.getOutputStream();
         ps=new PrintStream(os);
         
         ps.println("ip :"+addr.getHostAddress()+"님의 접속을 환영합니다.");
         
         
         
//         is=sock.getInputStream();
//         isr=new InputStreamReader(is);//스트림
//         br=new BufferedReader(isr);
//         
//         System.out.println(br.readLine());
//         br.close();
//         isr.close();
//         is.close();
         ps.close();
         os.close();
         sock.close();
         serve.close();
      } catch (IOException e) {
         e.printStackTrace();
      }
      

   }

}