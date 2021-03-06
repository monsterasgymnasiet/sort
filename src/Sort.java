import java.util.Scanner;

/**
 * Sortering f�r hastighet
 * @author lane01
 *
 */
public class Sort {
	public static void main(String[] args) {
		int tal[] = new int[20];
		int searched = 40;
		
		for (int i = 0; i < tal.length; i++) {
			tal[i] = (int) (Math.random()*50);
		}
		System.out.println( "Mata in ett tal: " );
		Scanner sc = new Scanner( System.in );
		int ada = sc.nextInt();
		System.out.println( "Du skrev talet: " + ada );
		
		printList("Slumpad lista", tal);
//		System.out.println( "         Position f�r " + searched + " �r " + search( searched, tal ) );
		bubbleSort(tal);
//		insertionSort(tal);
		printList("Sorterad lista", tal);
//		System.out.println( "Sorterad position f�r " + searched + " �r " + search( searched, tal ) );
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
	
	/* test sortering */
	
	/* Returns postition or -1 if not found */
	private static int search( int s, int[] list ) {
		for ( int i = 0; i < list.length; i++ ) {
			if ( list[ i ] == s ) {
				return i;
			}
		}
		return -1;
	}
	
	private static void annat() {
		String namn = "Ola";
		namn.compareTo(namn);
	}
}
