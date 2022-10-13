package com.example.miprimeraapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.view.MenuItem
import android.view.View
import android.widget.FrameLayout
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.appbar.MaterialToolbar
import com.google.android.material.navigation.NavigationView

open class PintorMenuActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

   lateinit var layoutPintor : DrawerLayout

    override fun setContentView(view: View?) {
        layoutPintor = layoutInflater.inflate(R.layout.activity_pintor_menu, null) as DrawerLayout
        val container:FrameLayout = layoutPintor.findViewById(R.id.contenedor_actividad)
        container.addView(view)
        super.setContentView(layoutPintor)
        val barra : MaterialToolbar = layoutPintor.findViewById(R.id.barra_app)
        setSupportActionBar(barra)
        val navView : NavigationView = layoutPintor.findViewById(R.id.navigation_view)
        navView.setNavigationItemSelectedListener(this)

        val toggle : ActionBarDrawerToggle = ActionBarDrawerToggle(this, layoutPintor, barra,
                    R.string.menu_drawer_open, R.string.meu_drawer_close)
        layoutPintor.addDrawerListener(toggle)
         toggle.syncState()
    }




    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        layoutPintor.closeDrawer(GravityCompat.START)
        when(item.itemId){
            R.id.nav_suma ->{
                startActivity(Intent(this, SumaActivity::class.java))
                overridePendingTransition(0,0)
            }
            R.id.nav_galeria -> {
                startActivity(Intent(this, GaleriaActivity::class.java))
                overridePendingTransition(0,0)
            }
            R.id.nav_modificar_tamaño -> {
                startActivity(Intent(this, AgrandarTextoActivity::class.java))
            }
            }
        return false
        }



    protected fun allocateActivityTitle(tituloString : String)
    {
        if(getSupportActionBar() != null){
            getSupportActionBar()?.setTitle(tituloString)
        }
    }

    fun irAInicio(view: View)
    {
        startActivity(Intent(this, BarraAppActivity::class.java))
        overridePendingTransition(0,0)
    }

}