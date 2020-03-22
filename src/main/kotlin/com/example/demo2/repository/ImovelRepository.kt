package com.example.demo2.repository

import com.example.demo2.entity.Imovel
import org.springframework.data.repository.PagingAndSortingRepository

interface ImovelRepository : PagingAndSortingRepository<Imovel, String> {

}