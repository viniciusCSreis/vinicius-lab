package com.example.demo2.service

import com.example.demo2.controller.request.ImovelRequest
import com.example.demo2.controller.response.ImovelResponse
import com.example.demo2.controller.response.PageResponse
import org.springframework.data.domain.Pageable

interface ImovelService {

    fun create(imovelRequest: ImovelRequest) : ImovelResponse

    fun edit(imovelRequest: ImovelRequest, id : String) : ImovelResponse

    fun list(pageable: Pageable) : PageResponse<ImovelResponse>

    fun delete(id : String)
}