import java.util.LinkedList;

public class QueueImpl<E> implements Queue<E> {

    E[] data;//creamos un vector el cual forma la cola
    int p;//indice que nos dice cuantos elementos hay actualmente en la cola

    public QueueImpl(int len) {//constructor

        this.data = (E[])new Object[len];//se crea la cola con el tamaño que nos pasen en el constructor
        this.p = 0;//el numero de elementos es cero
    }

    public void push(E e) throws QueueFullException{

        if (this.isFull()) throw new QueueFullException();//si la cola esta llena enviar error

        data[p] = e;//añadimos el elemento e incrementamos el indice
        p = p++;

    }

    private boolean isFull() {//comprobar si la cola esta llena
        //p  / this.data.length
        if ((p/this.data.length)<1) {
            return false;
        }
        else
            return true;
    }

    public E pop() throws QueueEmptyException {//Eliminamos el primer elemento de la cola y desplazamos todos los elementos una posición
        if (this.isEmpty()) throw new QueueEmptyException();

        E res = this.data[0];
        p=p-1;
        lshift();

        return res;
    }

    private void lshift() {//desplazamos todos los elementos en una posicion
        int i=0;
        while(i<p){
            data[i]=data[i+1];
            i++;
        }

    }

    private boolean isEmpty() {
        if(this.size()==0) {
            return true;
        }
        else
            return false;
    }

    public int size() {
        return this.p;
    }
}
