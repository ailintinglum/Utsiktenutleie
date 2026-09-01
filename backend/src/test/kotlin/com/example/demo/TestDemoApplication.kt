package com.utsiktenutleie

import org.springframework.boot.fromApplication

fun main(args: Array<String>) {
	fromApplication<DemoApplication>().run(*args)
}
