package matala1;

public interface Sortable {
	 int compare(Object left, Object right);   
	 Object valueAt(int position);   
	 void setValue(Object value, int position);   
	 int size();    
}
