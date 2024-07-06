package class22032024;

public class Take4arrayandshowindifferentformat
{

	public static void main(String[] args) 
	{
		//String a1=null; int c=0,d=0;char b=0;
		// TODO Auto-generated method stub
		int Rollno[]=new int[4];
		Rollno[0]=001;
		 Rollno[1]=002;
		 Rollno[2]=003;
		 Rollno[3]=004;
		 String StudentName[]= new String[-4];
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
				System.out.println("StudentName  Gender  Rollno  Phoneno");
				for (int i=0;i<4;i++)
				{
					System.out.print(StudentName[i]+"          "+Gender[i]+"       "+Rollno[i]+"       "+(Phone[i]));
					System.out.println();
				}
				
			}
	
				/*System.out.print("StudentName    Gender    Rollno    Phoneno");
				System.out.println();

				System.out.print((StudentName[0])+"    "+(Gender[0])+"    "+(Rollno[0])+"    "+(Phone[0]));
				System.out.println();
				System.out.print((StudentName[1])+"    "+(Gender[1])+"    "+(Rollno[1])+"    "+(Phone[1]));
			    System.out.println();
			    System.out.print((StudentName[2])+"    "+(Gender[2])+"    "+(Rollno[2])+"    "+(Phone[2]));
				System.out.println();
				System.out.print((StudentName[3])+"    "+(Gender[3])+"    "+(Rollno[3])+"    "+(Phone[3]));				
				System.out.println();
				*/
}

