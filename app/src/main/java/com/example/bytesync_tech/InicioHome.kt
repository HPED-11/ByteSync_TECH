package com.example.bytesync_tech

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.PersistableBundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import androidx.appcompat.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.example.bytesync_tech.databinding.InicioPaginaBinding

class InicioHome : AppCompatActivity() {
    private lateinit var binding: InicioPaginaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = InicioPaginaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val toolbar =findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayShowTitleEnabled(false)

        setupNavegacion()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.logo -> {
                // Aquí puedes agregar la lógica que desees para el ícono del menú
                return true
            }
            else -> return super.onOptionsItemSelected(item)
        }
    }

    fun irALaWeb(view: View) {
        val url = "https://bytesync-tech.com/vista/login/login.php"
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(intent)
    }

    private var githubClicked = false

    fun irAGithub(view: View) {
        val githubBtn = findViewById<Button>(R.id.github_btn)
        if (githubClicked) {
            githubBtn.text = "Github"
            findViewById<Button>(R.id.gitlab_btn).visibility = View.VISIBLE
            findViewById<Button>(R.id.version_btn).visibility = View.VISIBLE
            findViewById<Button>(R.id.salir_btn).visibility = View.VISIBLE

            findViewById<Button>(R.id.hubweb_btn).visibility = View.GONE
            findViewById<Button>(R.id.labweb_btn).visibility = View.GONE
            findViewById<Button>(R.id.hubapp_btn).visibility = View.GONE
            findViewById<Button>(R.id.labapp_btn).visibility = View.GONE
        } else {
            githubBtn.text = "Volver"
            findViewById<Button>(R.id.gitlab_btn).visibility = View.GONE
            findViewById<Button>(R.id.version_btn).visibility = View.GONE
            findViewById<Button>(R.id.salir_btn).visibility = View.GONE

            findViewById<Button>(R.id.hubweb_btn).visibility = View.VISIBLE
            findViewById<Button>(R.id.labweb_btn).visibility = View.GONE
            findViewById<Button>(R.id.hubapp_btn).visibility = View.VISIBLE
            findViewById<Button>(R.id.labapp_btn).visibility = View.GONE
        }
        githubClicked = !githubClicked
    }

    private var gitlabClicked = false

    fun irAGitlab(view: View) {
        val gitlabBtn = findViewById<Button>(R.id.gitlab_btn)
        if (gitlabClicked) {
            gitlabBtn.text = "Gitlab"
            findViewById<Button>(R.id.github_btn).visibility = View.VISIBLE
            findViewById<Button>(R.id.version_btn).visibility = View.VISIBLE
            findViewById<Button>(R.id.salir_btn).visibility = View.VISIBLE

            findViewById<Button>(R.id.hubweb_btn).visibility = View.GONE
            findViewById<Button>(R.id.labweb_btn).visibility = View.GONE
            findViewById<Button>(R.id.hubapp_btn).visibility = View.GONE
            findViewById<Button>(R.id.labapp_btn).visibility = View.GONE
        } else {
            gitlabBtn.text = "Volver"
            findViewById<Button>(R.id.github_btn).visibility = View.GONE
            findViewById<Button>(R.id.version_btn).visibility = View.GONE
            findViewById<Button>(R.id.salir_btn).visibility = View.GONE

            findViewById<Button>(R.id.hubweb_btn).visibility = View.GONE
            findViewById<Button>(R.id.labweb_btn).visibility = View.VISIBLE
            findViewById<Button>(R.id.hubapp_btn).visibility = View.GONE
            findViewById<Button>(R.id.labapp_btn).visibility = View.VISIBLE
        }
        gitlabClicked = !gitlabClicked
    }

    private fun setupNavegacion() {
        val bottomNavigationView = binding.bottomNavigationView
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        NavigationUI.setupWithNavController(
            bottomNavigationView,
            navHostFragment.navController
        )
    }

}