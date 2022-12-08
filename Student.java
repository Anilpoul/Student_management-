import com.student.manage.*;
import java.io.*;

public class Student {

	public static void main(String[] args)       throws IOException {
		
		BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));
		System.out.println("Welcome to Student management System :  ");
		
		int ch;
		do {
				System.out.println("1.Add student : ");
				System.out.println("2. Delete  student : ");
				System.out.println("3. display  student : ");
				System.out.println("4. Exit : ");
				
				System.out.println("Enter your choice :");
				ch = Integer.parseInt(br.readLine());
				
				switch(ch)
				{
						case 1:
							System.out.println("Enter user name :");
							String name = br.readLine();
							
							System.out.println("Enter user's Mobile  :");
							String mobile = br.readLine();
							
							System.out.println("Enter user city  :");
							String city  = br.readLine();
							
							Studentdata sd = new Studentdata(name, mobile, city);
							boolean answer = StudentD.insertToDB(sd);
							if(answer) {
								System.out.println("student succesfully added ");
							}
							else
								System.out.println("Something went wrong ");
							System.out.println(sd);
					
							break;
						
						case 2:
							//delete student 
							System.out.println("Enter Student id to delete : ");
							int userId = Integer.parseInt(br.readLine());
							boolean f = StudentD.deleteStudent(userId);
							if(f)
							System.out.println("Deleted......");
							else
							System.out.println("Something went wrong ....");

							break;
							
						case 3:
							
							StudentD.ShowStudents();


							break;
							
						
				}
			
		}while(ch!=5);
		
		
		System.out.println(" Thank you .......");
	}

}
