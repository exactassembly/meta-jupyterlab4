
SUMMARY = "Pygments theme using JupyterLab CSS variables"
HOMEPAGE = "https://github.com/jupyterlab/jupyterlab_pygments"
AUTHOR = "Jupyter Development Team <jupyter@googlegroups.com>"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=20a40995a0b2f0ae1f2a70d2dc995bbf"

SRC_URI[sha256sum] = "7405d7fde60819d905a9fa8ce89e4cd830e318cdad22a0030f7a901da705585d"

SRC_URI += "file://0001_fix_build_dependency.patch.patch"
FILESEXTRAPATHS:prepend := "${THISDIR}/python3-jupyterlab-pygments:"

PYPI_PACKAGE = "jupyterlab_pygments"

DEPENDS += "\
    python3-jupyter-packaging-native \
    python3-tomlkit-native \
    python3-deprecation-native \
"

inherit pypi python_hatchling

RDEPENDS:${PN} += "\
    ${PYTHON_PN}-pygments \    
"

FILES:${PN} += "\
  /usr/share \
  /usr/share/jupyter \
  /usr/share/jupyter/labextensions \
  /usr/share/jupyter/labextensions/jupyterlab_pygments \
  /usr/share/jupyter/labextensions/jupyterlab_pygments/package.json \
  /usr/share/jupyter/labextensions/jupyterlab_pygments/install.json \
  /usr/share/jupyter/labextensions/jupyterlab_pygments/static \
  /usr/share/jupyter/labextensions/jupyterlab_pygments/static/style.js \
  /usr/share/jupyter/labextensions/jupyterlab_pygments/static/*.js \
  /usr/share/jupyter/labextensions/jupyterlab_pygments/static/third-party-licenses.json \
"