// Generated from c:\Users\Laudi\source\repos\compiler\src\main\java\project\start\start.g4 by ANTLR 4.9.2

    package project.start;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link startParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface startVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link startParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS(startParser.SContext ctx);
}