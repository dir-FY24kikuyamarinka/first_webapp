package listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class AppScopeLogListener
 *
 */
@WebListener
public class AppScopeLogListener implements ServletContextAttributeListener {

    /**
     * Default constructor. 
     */
    public AppScopeLogListener() {
        // TODO Auto-generated constructor stub

    public void attributeAdded(ServletContextAttributeEvent scae) {
            System.out.println("アプリケーションスコープに登録しました: " + scae.getName() + "=" + scae.getValue());
        }
    }
	
}
