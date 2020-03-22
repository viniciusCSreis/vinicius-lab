package com.example.demo2.entity

import com.example.demo2.enums.TipoImovel
import org.hibernate.annotations.GenericGenerator
import javax.persistence.Entity
import javax.persistence.EnumType
import javax.persistence.Enumerated
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull

@Entity
data class Imovel(
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "org.hibernate.id.UUIDGenerator")
    val id: String = "",

    @field:NotNull
    val cep: String,

    @field:NotBlank
    val endereco: String,

    @field:NotNull
    val numero: Long,

    @Enumerated(EnumType.STRING)
    @field:NotNull
    val tipoImovel: TipoImovel,

    val andar: Long?
)