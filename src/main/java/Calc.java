import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import java.rmi.server.UnicastRemoteObject;

public class Calc extends UnicastRemoteObject implements ICalc {
    public Calc() throws RemoteException {
    }

    public Integer sum(List<Integer> params) throws RemoteException {
        Integer sum = 0;
        for (Integer param : params) {
            sum += param;
        }
        return sum;

    }

}