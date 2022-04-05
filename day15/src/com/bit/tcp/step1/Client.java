package com.bit.tcp.step1;

import java.io.*;
import java.net.*;
public class Client {

   public static void main(String[] args) {
      Socket sock=null;
      InetAddress inet= null;
//    OutputStream os=null;
//    PrintStream ps=null;
      InputStream is=null;
      InputStreamReader isr=null;
      BufferedReader br=null;
      try {
         inet= InetAddress.getByAddress(new byte[] {(byte)192,(byte)168,(byte)128,(byte)138});
         sock=new Socket(inet,5000);
         //메시지 읽어오기
         is=sock.getInputStream();
         isr=new InputStreamReader(is);
         br=new BufferedReader(isr);
         System.out.println(br.readLine());
         
//       os=sock.getOutputStream();
//       ps=new PrintStream(os);
//       ps.println("내가 왔다...");
//         
//       ps.close();
//       os.close();
         br.close();
         isr.close();
         sock.close();
      } catch (IOException e) {
         e.printStackTrace();
      }
      
   }

}