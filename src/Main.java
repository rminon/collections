import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		Collection<Foo> foos = new ArrayList<Foo>() {{
			add(new Foo() {{
				foo1 = 2;
				foo2 = 3;
				foo3 = 4;
			}});
			add(new Foo() {{
				foo1 = 8;
				foo2 = 4;
				foo3 = 589;
			}});
		}};
		Collection<Foo> foos2 = new ArrayList<Foo>() {{
			add(new Foo() {{
				foo1 = 2;
				foo2 = 3;
				foo3 = 4;
			}});
			add(new Foo() {{
				foo1 = 36;
				foo2 = 4;
				foo3 = 589;
			}});
		}};
		
//		List<Integer> foos3 = List.of(1,2,5);
//		for (Foo foo: foos) {
//			foos.remove(foo); 	
//		}
		

//		for(Iterator<Foo> i = fooIterable.iterator(); i.hasNext();) {
//		    Foo foo = i.next();
//		    i.remove();
//		}
		
		Foo [] fooArray = foos.toArray(new Foo[0]);
		Foo [] fooArray2 = foos2.toArray(new Foo[0]);
		
		
		System.out.println(fooArray[1].foo1);
		System.out.println(fooArray2[1].foo1);
		
		List<Fee> fees = new ArrayList<>();
		fees.add(new FooChild1());
		fees.add(new FooChild2());
		fees.add(new FooChild2());
		

		for(Iterator<Fee> i = fees.iterator(); i.hasNext();) {
		    Fee fe = i.next();
		    fe.doSomething();
		}

	}

}

class Foo {
	int foo1;
	int foo2;
	int foo3;
}
abstract class Fee {
	int foo1;
	int foo2;
	int foo3;
	abstract void doSomething();
}

class FooChild1 extends Fee {
	String child1;
	void doSomething() {
		System.out.println("C1");
	}
}

class FooChild2 extends Fee {
	int fooChild2;
	void doSomething() {
		System.out.println("C2");
	}
}


// class FooIterable implements Iterable<Foo>(){
//
// @Override
// public Iterator<Foo> iterator() {
// // TODO Auto-generated method stub
// return null;
// }
// }
