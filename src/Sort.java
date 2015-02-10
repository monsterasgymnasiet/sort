public class Sort {

	public static void main(String[] args) {
		int tal[] = new int[10];
		int searched = 22;
		
		for (int i = 0; i < tal.length; i++) {
			tal[i] = (int) (Math.random()*100);
		}
		printList("Slumpad lista", tal);
		System.out.println( "         Position för " + searched + " är " + search( searched, tal ) );
//		bubbleSort(tal);
		insertionSort(tal);
		printList("Sorterad lista", tal);
		System.out.println( "Sorterad position för " + searched + " är " + search( searched, tal ) );
	}
	
	private static void printList( String head, int[] list ){
		System.out.print(head+": ");
		for (int i = 0; i < list.length; i++){
			System.out.print(list[i]+"\t");
		}
		System.out.print("\n");
	}
	
	private static void bubbleSort( int[] list ) {
		for (int i = 0; i < list.length-1;i++){
			for ( int j = i+1; j <(list.length); j++ )  {
				if ( list[i]>list[j]){
					int temp = list[j];
					list[j]=list[i];
					list[i]=temp;
				}
			}
		}
	}

	private static void insertionSort( int[] list ) {
		int start = 0;
		int end = list.length;
		
		for (int i = start+1; i < end;i++){
			for ( int j = start; j < i; j++ )  {
				if ( list[i]<list[j]){
					int temp = list[j];
					list[j]=list[i];
					list[i]=temp;
				}
			}
		}
	}
	
	/* Returns postition or -1 if not found */
	private static int search( int s, int[] list ) {
		for ( int i = 0; i < list.length; i++ ) {
			if ( list[ i ] == s ) {
				return i;
			}
		}
		return -1;
	}
}
