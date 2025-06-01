package day4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JButton;

public class Main1 {
	public static void main(String[] args) throws Exception {
		String driver = "com.mysql.cj.jdbc.Driver";
		Class.forName(driver);			//->反射
		
		Connection conn = 
				DriverManager.getConnection("jdbc:mysql://localhost:3306/aabb", "root", "a123");
		System.out.println("连接成功");
		
		//insert
		//delete
		//update
		//select
		
		//select * from student;
		//select * from grade;
		//名字	科目		分数
		//
		
		
//		JButton btn = null;
//		//lambda
//		btn.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//				System.out.println("hello");
//			}
//		});
//		
//		btn.addActionListener(e->System.out.println("hello"));
		
	}
}
