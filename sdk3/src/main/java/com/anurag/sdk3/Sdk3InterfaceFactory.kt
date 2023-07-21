package com.anurag.sdk3

object Sdk3InterfaceFactory {
    fun getObject(): Sdk3Interface {
        return Sdk3InterfaceImpl()
    }
}