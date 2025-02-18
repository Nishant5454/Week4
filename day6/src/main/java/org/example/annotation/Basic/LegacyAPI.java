package org.example.annotation.Basic;

public class LegacyAPI {
    @Deprecated
  //  public static void oldFeature(){
     //   System.out.println("This is old feature");
//}
    //public static void newFeature(){
      //  System.out.println("This is new Feature");
  //  }

    public static void main(String[] args) {
        LegacyAPI.oldfeature();
        LegacyAPI.newFeature();

    }
@Deprecated
    private static void oldfeature() {
    System.out.println("This is old feature");
    }
    private static void newFeature(){
        System.out.println("This is new feature");
    }


}
