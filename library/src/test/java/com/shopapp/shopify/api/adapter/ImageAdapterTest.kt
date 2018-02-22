package com.shopapp.shopify.api.adapter

import com.shopapp.shopify.JodaTimeAndroidRule
import com.shopapp.shopify.StorefrontMockInstantiator
import junit.framework.Assert.assertEquals
import junit.framework.Assert.assertNotNull
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class ImageAdapterTest {

    @Rule
    @JvmField
    var jodaTimeAndroidRule = JodaTimeAndroidRule()

    @Test
    fun shouldAdaptFromImageStorefrontToImage() {
        val result = ImageAdapter.adapt(StorefrontMockInstantiator.newImage())
        assertNotNull(result!!)
        assertEquals(StorefrontMockInstantiator.DEFAULT_ID, result.id)
        assertEquals(StorefrontMockInstantiator.DEFAULT_SRC, result.src)
        assertEquals(StorefrontMockInstantiator.DEFAULT_ALT_TEXT, result.alt)
    }
}