package com.acme.books;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * <p>Registers the books JAX-RS application.</p>
 *
 * @author Tilen Faganel
 * @since 2.0.0
 */
@ApplicationPath("/")
public class BooksApplication extends Application {

}
