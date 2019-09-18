package housing;


import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//import javax.imageio.ImageIO;
//import java.awt.image.BufferedImage;
//import java.io.File;
//import java.net.MalformedURLException;
//import java.net.URL;

public class Main {

//	private static URL url;

	public static void main(String[] args) throws IOException {
		
		House[]houses = new House[3];
		Photo[]photos = new Photo[3];
		
		
		
		try {
			FileWriter fobj = new FileWriter ("house.txt",true);
			
				Scanner input = new Scanner (System.in);
				for (int i=0;i<3;i++) {
					House house = new House();
					Photo photo = new Photo();
					System.out.println ("Enter your id ");
					house.setId(input.nextInt());
					System.out.println ("Enter the price ");
					house.setPrice(input.nextFloat());
					System.out.println ("Enter the location ");
					house.setLocation(input.next());
					System.out.println ("Enter the advertiser ");
					house.setAdvertiser(input.next());
					System.out.println ("Enter the name of the town where the photo was taken ");
					photo.setName(input.next());
					System.out.println ("Enter the type of photo (abstract or otherwise) ");
					photo.setType(input.next());
					
//					System.out.println ("Enter the url for the image ");
//					house.setImage(photo);		
//					url = null;
//				     
//				    BufferedImage image = null;
//				     
//				    try{
//				        url = new URL("https://javaconceptoftheday.com/wp-content/NumberPatternPrograms.png");
//				    } 
//				    catch (MalformedURLException e) 
//				    {
//				        e.printStackTrace();
//				    }
//				     
//				    try {
//				        image = ImageIO.read(url);
//				         
//				        ImageIO.write(image, "jpg", new File("I:/output.jpg"));
//				         
//				        ImageIO.write(image, "png", new File("I:/output.png"));
//				         
//				        ImageIO.write(image, "gif", new File("I:/output.gif"));
//				         
//				        ImageIO.write(image, "bmp", new File("I:/output.bmp"));
//				    } catch (IOException e) {
//				        e.printStackTrace();
//				    }
//				     
				    System.out.println("done");
				    
					input.hasNextLine(); //clears buffer
					houses[i]=house; //array is updated
					photos[i]=photo; 
				} //end of For loop
				
				input.close();
				fobj.close();
				
				for (House house :houses) {
					System.out.println(house);
				}
				for (Photo photo :photos) {
					System.out.println(photo);
				}
				
		} catch (IOException e2) {
			System.out.println("The file could not be found");
			e2.printStackTrace();
		}
		
			
	}// end of Main

}
