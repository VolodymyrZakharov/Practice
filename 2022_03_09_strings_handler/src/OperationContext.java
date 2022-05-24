
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;

/**
 * Loads and provides all operations by their names
 */
public class OperationContext {

    // stores operations by their names
    Map<String, IStringOperation> operationsSource;

    /**
     * The method creates instances for all the operations by their names and places them into operationsSource
     *
     * @param operationPaths the paths to the operations ('de.telran.operation.UpperCaseOperation')
     */
    public void loadOperations(List<String> operationPaths) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        // TODO implement.
        for (String path : operationPaths) {
            Class operationClass = Class.forName(path);
            IStringOperation newInstance = (IStringOperation) operationClass.getConstructor().newInstance();
            operationsSource.put(newInstance.getName(), newInstance);
        }
    }

    public IStringOperation getOperation(String name) {
        return operationsSource.get(name);
    }
}