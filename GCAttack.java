import java.util.LinkedList;

public class GCAttack {

    public static void main(String[] args) {
		int count = 0;
		int n = 320000;
		int k = 6500;
		MyObject a = null;
        LinkedList<MyObject> list = new LinkedList<MyObject>();
		
        for (int i=0; i<n; i++) {
            list.add(new MyObject(k));
        }
		
		for (int i=0; i<n; i++) {
			for (int j=0; j<100; j++) {
				a = new MyObject(k);		
			}
			if (count==3) {
				count = 0;
				list.remove();	
			}
			else
				count++;
		}
    }
}
