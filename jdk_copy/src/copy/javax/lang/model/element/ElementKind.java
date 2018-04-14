package copy.javax.lang.model.element;

//package javax.lang.model.element;
/**
 * copy form package javax.lang.model.element.ElementKind
 */
import javax.lang.model.element.*;

/**
 * The {@code kind} of an element.
 *
 * <p>Note that it is possible additional element kinds will be added
 * to accommodate new, currently unknown, language structures added to
 * future versions of the Java&trade; programming language.
 *
 * @author Joseph D. Darcy
 * @author Scott Seligman
 * @author Peter von der Ah&eacute;
 * @see javax.lang.model.element.Element
 * @since 1.6
 */
public enum ElementKind {

    /** A package. */
    PACKAGE,//应用包

    /*
        ------------声明类型
     */
    // Declared types
    /** An enum type. */
    ENUM,//枚举
    /** A class not described by a more specific kind (like {@code ENUM}). */
    CLASS,//一般的类型，例如（非 ENUM 等等...
    /** An annotation type. */
    ANNOTATION_TYPE,//注解类型
    /**
     * An interface not described by a more specific kind (like
     * {@code ANNOTATION_TYPE}).
     */
    INTERFACE,//一般的接口类型，例如（非 注解类型

    /*
        -----------变量类型
     */
    // Variables
    /** An enum constant. */
    ENUM_CONSTANT,//枚举常量
    /**
     * A field not described by a more specific kind (like
     * {@code ENUM_CONSTANT}).
     */
    FIELD,//普通的成员变量，例如（非枚举常量
    /** A parameter of a method or constructor. */
    PARAMETER,//方法或者构造器中的 参数类型
    /** A local variable. */
    LOCAL_VARIABLE,//局部变量
    /** A parameter of an exception handler. */
    EXCEPTION_PARAMETER,//catch 中的变量类型？

    /*
        可执行的Element
     */
    // Executables
    /** A method. */
    METHOD,//方法
    /** A constructor. */
    CONSTRUCTOR,//构造器
    /** A static initializer. */
    STATIC_INIT,//？静态初始化器？，包括静态成员变量赋值和static块吗？？？ // TODO: 2018/4/13
    /** An instance initializer. */
    INSTANCE_INIT,//? 对象初始化器？ 包括成员变量赋值和对象初始化块吗 ？？？

    /** A type parameter. */
    TYPE_PARAMETER,//参数化类型

    /**
     * An implementation-reserved element.  This is not the element
     * you are looking for.
     */
    OTHER,

    /**
     * A resource variable.
     * @since 1.7
     */
    RESOURCE_VARIABLE;//资源变量？


    /**
     * Returns {@code true} if this is a kind of class:
     * either {@code CLASS} or {@code ENUM}.
     *
     * @return {@code true} if this is a kind of class
     */
    public boolean isClass() {
        return this == CLASS || this == ENUM;
    }

    /**
     * Returns {@code true} if this is a kind of interface:
     * either {@code INTERFACE} or {@code ANNOTATION_TYPE}.
     *
     * @return {@code true} if this is a kind of interface
     */
    public boolean isInterface() {
        return this == INTERFACE || this == ANNOTATION_TYPE;
    }

    /**
     * Returns {@code true} if this is a kind of field:
     * either {@code FIELD} or {@code ENUM_CONSTANT}.
     *
     * @return {@code true} if this is a kind of field
     */
    public boolean isField() {
        return this == FIELD || this == ENUM_CONSTANT;
    }
}
