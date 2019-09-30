package polymorphism;


	
		
		class Domain{
		    public void Frontend(){
		        System.out.println("UI & UX");
		    }
		    public void Backend(){
		        System.out.println("Java & Python");
		    }
		    
		}
		class Fullstackdeveloper extends Domain{
		    public void Frontend(){
		        System.out.println("Angular");
		    }
		    
		    public void Backend(){
		        System.out.println("Only Java");
		    }
		 
		    public void Work(){
		        System.out.println("Software");
		    }
		}
		 
		public class Overriding{
		    public static void main(String [] args){
		        Fullstackdeveloper e = new Fullstackdeveloper();
		    	Domain d = new Fullstackdeveloper();
		        d.Frontend();
		        d.Backend();
		        e.Work();
		    }
		}


