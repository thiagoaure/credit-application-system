package me.dio.credit.application.system.service

import me.dio.credit.application.system.entity.Credit
import me.dio.credit.application.system.entity.Customer
import java.util.*

interface ICustomerService {
    fun save(customer: Customer): Customer
    fun findById(customerId: Long): Customer
    fun delete(customerId: Long)
}