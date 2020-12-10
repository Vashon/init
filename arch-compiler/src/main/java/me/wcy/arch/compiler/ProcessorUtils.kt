package me.wcy.arch.compiler

object ProcessorUtils {
    const val PARAM_NAME = "moduleList"
    const val METHOD_NAME = "loadModule"
    const val PACKAGE_NAME = "me.wcy.arch.annotation.moduleloader"
    const val JAVADOC = "DO NOT EDIT THIS FILE! IT WAS GENERATED BY ARCH.\n"

    fun formatModuleName(moduleName: String): String {
        return moduleName.replace('-', '_')
    }
}