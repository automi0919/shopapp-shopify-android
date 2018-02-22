package com.shopapp.shopify.api.adapter

import com.shopapp.gateway.entity.Order
import com.shopify.buy3.Storefront

object OrderListAdapter {

    fun adapt(orderConnection: Storefront.OrderConnection?): List<Order> =
        orderConnection?.edges?.map { OrderAdapter.adapt(it.node, it.cursor) } ?: listOf()
}
