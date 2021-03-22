/**
 IssCommSupport.java
 ==========================================================================

 ==========================================================================
 */
package supports;
import interaction.IssObserver;
import interaction.IssOperations;

public interface IssCommSupport extends IssOperations {
    void registerObserver( IssObserver obs );
    void removeObserver( IssObserver obs );
    void close();
}
