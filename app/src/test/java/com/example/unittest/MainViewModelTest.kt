package com.example.unittest

import junit.framework.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.mockito.Mockito.*

class MainViewModelTest {

    private lateinit var mainViewModel: MainViewModel

    private lateinit var cuboidModel: CuboidModel

    private val testLength = 12.0

    private val testWidth = 7.0

    private val testHeight = 6.0

    private val testVolume = 504.0

    private val testCircumference = 100.0

    private val testSurfaceArea = 396.0

    @Before
    fun before(){
        cuboidModel = mock(CuboidModel::class.java)
        mainViewModel = MainViewModel(cuboidModel)
    }

    @Test
    fun testVolume(){
        cuboidModel = CuboidModel()
        mainViewModel = MainViewModel(cuboidModel)
        mainViewModel.save(testLength, testWidth, testHeight)
        val volume = mainViewModel.getVolume()
        assertEquals(testVolume, volume, 0.0001)
    }

    @Test
    fun testCircumference() {
        cuboidModel = CuboidModel()
        mainViewModel = MainViewModel(cuboidModel)
        mainViewModel.save(testWidth, testLength, testHeight)
        val volume = mainViewModel.getCircumference()
        assertEquals(testCircumference, volume, 0.0001)
    }

    @Test
    fun tesSurfaceArea() {
        cuboidModel = CuboidModel()
        mainViewModel = MainViewModel(cuboidModel)
        mainViewModel.save(testWidth, testLength, testHeight)
        val volume = mainViewModel.getSurfaceArea()
        assertEquals(testSurfaceArea, volume, 0.0001)
    }

    @Test
    fun testMockVolume(){
        `when` (mainViewModel.getVolume()).thenReturn(testVolume)
        val volume = mainViewModel.getVolume()
        verify(cuboidModel).getVolume()
        assertEquals(testVolume, volume, 0.0001)
    }

    @Test
    fun testMockCircumference() {
        `when`(mainViewModel.getCircumference()).thenReturn(testCircumference)
        val circumference = mainViewModel.getCircumference()
        verify(cuboidModel).getCircumference()
        assertEquals(testCircumference, circumference, 0.0001)
    }

    @Test
    fun testMockSurfaceArea(){
        `when` (mainViewModel.getSurfaceArea()).thenReturn(testSurfaceArea)
        val surfaceArea = mainViewModel.getSurfaceArea()
        verify(cuboidModel).getSurfaceArea()
        assertEquals(testSurfaceArea, surfaceArea, 0.0001)
    }

}