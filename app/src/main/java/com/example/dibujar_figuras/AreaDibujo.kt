package com.example.dibujar_figuras

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View
import android.widget.Toast


class AreaDibujo(var contexto: Context,atributos:AttributeSet):View(contexto,atributos){
   protected var pincel:Paint=Paint()
   protected var figura:Int?=null
    init{
        pincel.strokeWidth= 10F
        pincel.setARGB(255,255,0,0)
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        when(figura) {
            0 -> canvas.drawRect(canvas.width/2F, canvas.height/2F, 300F, 300F, pincel)
            1 -> canvas.drawCircle(canvas.width/2F, canvas.height/2F, 100F, pincel)

            // canvas.drawRect(100F,100F,300F,300F,pincel)
        }

    }

    fun dibujarRectangulo(posx:Float,posy:Float,ancho:Float,alto:Float)
    {
       figura=0

        invalidate()
    }
    fun dibujarCirculo()
    {
        figura=1
        invalidate()
    }

}


