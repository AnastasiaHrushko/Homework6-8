package Homework6;

public class Runner {

     static MyArrayList myArrayList = new MyArrayList();

     public static void main(String[] args) {
          System.out.println(myArrayList.enumSize());
          System.out.println(myArrayList.isEmpty());
          //System.out.println(myArrayList.contains("bvhsb"));
          myArrayList.addLastElement("sibbhj");
          //myArrayList.remove("cbjkj");
          myArrayList.addElement(3, "njvjkd");
          System.out.println(myArrayList.getElement(5));
          System.out.println(myArrayList.indexOf("njsdk"));
          System.out.println(myArrayList.lastIndexOf("uhs"));
          System.out.println(myArrayList.removeAndReturn(6));
     }









     public MyArrayList getMyArrayList() {
          return myArrayList;
     }

     public void setMyArrayList(MyArrayList myArrayList) {
          this.myArrayList = myArrayList;
     }
}
