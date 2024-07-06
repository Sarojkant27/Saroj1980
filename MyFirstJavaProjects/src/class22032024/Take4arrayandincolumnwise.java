package class22032024;//assigment to take 4 array and print in given format

public class Take4arrayandincolumnwise {

	public static void main(String[] args) 
	{
		int Rollno[]=new int[4];
		Rollno[0]=001;
		 Rollno[1]=002;
		 Rollno[2]=003;
		 Rollno[3]=004;
		 String StudentName[]= new String[4];
		        StudentName[0]= "Ram";
				StudentName[1]="Sita";
				StudentName[2]="Lak";
				StudentName[3]="Ayoth";
				 char Gender[]= new char[4];
				Gender[0]='M';
				Gender[1]='F';
				Gender[2]='M';
				Gender[3]='M';
				int Phone[]= new int[4];	
				Phone[0]=5894684;
				Phone[1]=5894687;
				Phone[2]=5894681;
				Phone[3]=5894683;
				
				//System.out.print("StudentName    Gender    Rollno    Phoneno");
			//	System.out.println();

				System.out.print("StudentName "+ StudentName[0]+"      "+StudentName[1]+"      "+StudentName[2]+"      "+StudentName[3]) ;
				System.out.println();
				System.out.print("Gender      "+Gender[0]+"        "+Gender[1]+"         "+Gender[2]+"        "+Gender[3]);
			    System.out.println();
			    System.out.print("Rollno      "+Rollno[0]+"        "+Rollno[1]+"         "+Rollno[2]+"        "+Rollno[3]);
				System.out.println();
				System.out.print("Phone       "+Phone[0]+"  "+Phone[1]+"   "+Phone[2]+"  "+Phone[3]);				
				System.out.println();

	}

}
