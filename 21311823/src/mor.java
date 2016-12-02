import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;

public class mor{
   static BufferedImage inImg=null;//초기화
   static BufferedImage outImg=null;//이미지 받고 이미지 출력

   static int[][] G = new int[3][3];

  
   public static double GxGy(int[][] GG) {


	
	   int z=0;
 /*
	   //e
	   int a=(GG[0][1]&0xff)&(GG[1][0]&0xff)&(GG[1][1]&0xff)&(GG[1][2]&0xff)&(GG[2][1]&0xff); //0xff흰색
	  
	   if(a==0xff)
	  		   
	       return 0xff;
	   
	
	   else
		   return z;
   }
  */
   //d
	   int a=(GG[0][1]&0xff)|(GG[1][0]&0xff)|(GG[1][1]&0xff)|(GG[1][2]&0xff)|(GG[2][1]&0xff); //0xff흰색
		  
	   if(a==255){
	  		   
	       return 255;
	   }
	
	   else
		   return z;
   }
   
   public static void main(String[] args) throws IOException {
      try {
    	  
         inImg =ImageIO.read(new File("C:\\Users\\user\\workspace\\21311823\\src\\e1jpg"));
         outImg = new BufferedImage(inImg.getWidth(), inImg.getHeight(), BufferedImage.TYPE_INT_RGB);
    

         for (int i = 1; i < inImg.getWidth() - 1; i++) { 
            for (int j = 1; j < inImg.getHeight() - 1; j++) {
            	G[0][0] = new Color(inImg.getRGB(i - 1, j - 1)).getRed(); 
            	G[0][1] = new Color(inImg.getRGB(i - 1, j)).getRed();	
            	G[0][2] = new Color(inImg.getRGB(i - 1, j + 1)).getRed();
            	G[1][0] = new Color(inImg.getRGB(i, j - 1)).getRed();
            	G[1][1] = new Color(inImg.getRGB(i , j)).getRed();
            	G[1][2] = new Color(inImg.getRGB(i, j + 1)).getRed();
            	G[2][0] = new Color(inImg.getRGB(i + 1, j - 1)).getRed();
            	G[2][1] = new Color(inImg.getRGB(i + 1, j)).getRed();
            	G[2][2] = new Color(inImg.getRGB(i + 1, j + 1)).getRed();
            	
            	
            	
               int edge = (int) GxGy(G);
               
           
               outImg.setRGB(i, j, (edge << 16 | edge << 8 | edge)); //엗지색 흰색 레드 그린 블루
            }	
         }
      
        File outputfile = new    File("C:\\Users\\user\\workspace\\21311823\\src\\ed2.jpg");
         ImageIO.write(outImg, "jpg", outputfile);

      } catch (IOException ex) {
       System.err.println("사이즈미스 넓이 : " + inImg.getWidth() + "높이 :" + inImg.getHeight());
      }  
     }
   }