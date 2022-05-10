package oopsdemo3;

public class StudentDetails implements CollegeData,HostelData{
College c1=new College("mary",500,"delhi university","mca");
Hostel h1=new Hostel("ram","block A");


	@Override
	public void collegedetails() {
		// TODO Auto-generated method stub
System.out.println("**********clg details*******");
System.out.println("clg name "+c1.getName());
System.out.println("clg id "+c1.getId());
System.out.println("course "+c1.getCourse());
System.out.println("university "+c1.getUniversity());
	}

	@Override
	public void studentdata() {
		// TODO Auto-generated method stub
System.out.println("students can join courses: MCA,M.Tech,BCA,B.Tech");
	}
	@Override
	public void hostelDetails() {
		// TODO Auto-generated method stub
		System.out.println("**********hastel details*************");
		System.out.println("hostl name : "+h1.getName());
		System.out.println("location : "+h1.getLocation());
	}
	@Override
	public void studentRecord() {
		// TODO Auto-generated method stub
		System.out.println("students selected based on their percentage and financial situation");
	}

}
