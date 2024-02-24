Step 1. Add the JitPack repository to your build file

'''gradle
dependencyResolutionManagement {
		repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
		repositories {
			mavenCentral()
			maven { url 'https://jitpack.io' }
		}
	}
 ''''''

Step 2. Add the dependency

dependencies {
	        implementation 'com.github.kamal787818:paybyapisa:Tag'
	}
  OR
  [![](https://jitpack.io/v/kamal787818/paybyapisa.svg)](https://jitpack.io/#kamal787818/paybyapisa)
