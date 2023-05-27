package me.dio.credit.application.system.service

import me.dio.credit.application.system.entity.Customer
import me.dio.credit.application.system.repository.ICustomerRepository
import org.springframework.stereotype.Service

@Service
class CustomerService(
    private val customerRepository: ICustomerRepository
): ICustomerService {
    override fun save(customer: Customer): Customer = this.customerRepository.save(customer)

    override fun findById(customerId: Long): Customer  = this.customerRepository.findById(customerId).orElseThrow{
        throw RuntimeException("Id $customerId não encontrado")
    }
    override fun delete(customerId: Long) = this.customerRepository.deleteById(customerId)
}