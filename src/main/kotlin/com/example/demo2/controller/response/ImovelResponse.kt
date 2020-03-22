package com.example.demo2.controller.response

import com.example.demo2.enums.TipoImovel

data class ImovelResponse(

    val id: String,

    val cep: String,

    val endereco: String,

    val numero: Long,

    val tipoImovel: TipoImovel,

    val andar: Long?
)