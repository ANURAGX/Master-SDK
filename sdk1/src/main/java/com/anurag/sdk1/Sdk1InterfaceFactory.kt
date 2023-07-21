package com.anurag.sdk1

object Sdk1InterfaceFactory {
    fun getObject(): Sdk1Interface {
        return Sdk1InterfaceImpl()
    }
}