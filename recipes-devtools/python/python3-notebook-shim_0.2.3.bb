
SUMMARY = "A shim layer for notebook traits and config"
HOMEPAGE = "https://jupyterlab.readthedocs.io/"
AUTHOR = " <Jupyter Development Team <jupyter@googlegroups.com>>"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f91a22ac359078bf4380ccbace244c41"

SRC_URI[sha256sum] = "f69388ac283ae008cd506dda10d0288b09a017d822d5e8c7129a152cbd3ce7e9"

PYPI_PACKAGE = "notebook_shim"

DEPENDS += "\
"

inherit pypi python_hatchling

RDEPENDS:${PN} += "\
"

FILES:${PN} += "\
  /usr/etc \
  /usr/etc/jupyter \
  /usr/etc/jupyter/jupyter_server_config.d \
  /usr/etc/jupyter/jupyter_server_config.d/notebook_shim.json \
"