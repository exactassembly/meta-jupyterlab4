SUMMARY = "A hatch plugin to help build Jupyter packages"
HOMEPAGE = "https://github.com/jupyterlab/hatch-jupyter-builder#readme"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3a55a0c831659a5e5451fd45de9d4342"

inherit pypi python_hatchling

PYPI_PACKAGE = "hatch_jupyter_builder"

SRC_URI[sha256sum] = "0dbd14a8aef6636764f88a8fd1fcc9a91921e5c50356e6aab251782f264ae960"

BBCLASSEXTEND = "native nativesdk"

UPSTREAM_CHECK_REGEX = "/hatch-jupyter-builder/(?P<pver>(\d+[\.\-_]*)+)/"
