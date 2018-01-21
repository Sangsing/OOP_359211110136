package ooplab4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//เขียนโปรแกรมเพื่อรับค่าข้อมูลของนักศึกษาหนึ่งคนโดยมีข้อมูลดังนี้
//1. ชื่อ-สกุล
//2. รหัสนักศึกษา
//3. สาขาที่เรียน และคณะ
//4. ที่อยู่
//5. email
//หมายเหตุ: ต้องรับค่าข้อมูลแต่ละข้อมูลโดยการใช้ Methods
public class StudentData {
    static BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        String stdname = getStdName();
        String stdid = getStdID();
        String stdfac = getStdFac();
        String stdaddress = getStdAdd();
        String stdemail = getStdEmail();
        System.out.println("Student name:"+stdname+
                "ID: "+stdid+
                "Major and Faculty: "+stdfac+
                "Address:"+stdaddress+
                "Email:"+stdemail);
    }//main

    private static String getStdEmail() throws IOException {
        System.out.print("Enter your id: ");
        String email = reader.readLine();
        return email;
    }
    private static String getStdAdd() throws IOException {
        System.out.print("Enter your address: ");
        String add = reader.readLine();
        return add;
    }
    private static String getStdFac() throws IOException {
        System.out.print("Enter your Major and Faculty: ");
        String fac = reader.readLine();
        return fac;
    }
    private static String getStdID() throws IOException {
        System.out.print("Enter your id: ");
        String id = reader.readLine();
        return id;
    }
    private static String getStdName() throws IOException {
        System.out.print("Enter your name: ");
        //String s = reader.readLine();
        //return s;
        return reader.readLine();
    }
}//class

