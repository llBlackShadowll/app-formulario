package pe.edu.idat.app_formularios

import android.os.Bundle
import android.view.View
//import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
//import androidx.core.view.ViewCompat
//import androidx.core.view.WindowInsetsCompat
import pe.edu.idat.app_formularios.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btncalcular.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        val numero1 = binding.etnumero1.text.toString().toDouble()
        val numero2 = binding.etnumero2.text.toString().toDouble()
        val promedio = (numero1 * 0.4) + (numero2 * 0.6)
        val estado = if(promedio > 12.5){
            "APROBADO"
        }else "DESAPROBADO"
        val suma = numero1 + numero2
        //binding.tvresultado.setText("La suma es $suma")
        binding.tvresultado.setText("Su promedio es $promedio" +
        "usted se encuentra $estado")
    }
}