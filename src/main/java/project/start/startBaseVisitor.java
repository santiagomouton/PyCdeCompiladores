// Generated from c:\Users\Laudi\source\repos\compiler\src\main\java\project\start\start.g4 by ANTLR 4.9.2

    package project.start;

import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link startVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class startBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements startVisitor<T> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitS(startParser.SContext ctx) { return visitChildren(ctx); }
}