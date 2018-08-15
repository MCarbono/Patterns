/*utiliza-se a notação <E> para utilizar o iterable em qualquer tipo de collection*/
package Iterator;

import java.util.Iterator;


public interface Iterable<E> {
    Iterator<E> iterator();
}
