package com.anurag.sdk2

object Sdk2InterfaceFactory {
    fun getObject(): Sdk2Interface {
        return Sdk2InterfaceImpl()
    }
}